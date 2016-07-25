package com.healthcarebluebook.ggd;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * A fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    private Spinner procedureNameSpinner;
    private EditText zipCodeTextView;
    private Button getPriceButton;
    private TextView resultsTextView;

    public MainActivityFragment() {
    }

    @Override
    public void onClick(View v) {
        // make sure we are responding to the get price button and not anything else
        if (v.getId() == R.id.get_price_button) {
            // close the keyboard
            InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(zipCodeTextView.getWindowToken(), 0);
            // get the selected procedure name
            String procedureName = (String) procedureNameSpinner.getSelectedItem();
            // get the zip code
            String zipCode = zipCodeTextView.getText().toString();
            // query the "database" for the fair price for this procedure and this zip
            HcbbFairPrice fairPrice = HcbbFairPriceDatabase.GetHcbbFairPrice(procedureName, zipCode);

            String result =  String.format("An informed consumer can expect to pay %s for a %s in zip code %s.", fairPrice.getFairPrice(), fairPrice.getProcedureName(), fairPrice.getZipCode());

            resultsTextView.setText(result);
            resultsTextView.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View fragmentMain = inflater.inflate(R.layout.fragment_main, container, false);

        // assign our private variables to the controls we defined in fragment_main.xml so we can
        // do stuff with them.
        procedureNameSpinner = (Spinner) fragmentMain.findViewById(R.id.procedure_name_spinner);
        zipCodeTextView = (EditText) fragmentMain.findViewById(R.id.zip_code);
        getPriceButton = (Button) fragmentMain.findViewById(R.id.get_price_button);
        resultsTextView = (TextView) fragmentMain.findViewById(R.id.results_text);

        // Hide the results text. We don't want that to show up until after the Get Price button is tapped
        resultsTextView.setVisibility(View.GONE);

        // tell the button we will use this class' onClick method to handle any taps/clicks
        getPriceButton.setOnClickListener(this);

        return fragmentMain;
    }



}

