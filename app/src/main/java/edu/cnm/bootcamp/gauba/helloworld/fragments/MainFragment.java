package edu.cnm.bootcamp.gauba.helloworld.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;
import edu.cnm.bootcamp.gauba.helloworld.R;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass. Activities that contain this fragment must implement the
 * {@link MainFragment.OnFragmentInteractionListener} interface to handle interaction events. Use
 * the {@link MainFragment#newInstance} factory method to create an instance of this fragment.
 */
public class MainFragment extends Fragment {

  private OnFragmentInteractionListener mListener;

  public MainFragment() {
    // Required empty public constructor
  }

  // TODO: Rename and change types and number of parameters
  public static MainFragment newInstance() {
    return new MainFragment();
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view =  inflater.inflate(R.layout.fragment_main, container, false);
    Button btnhelloworld = (Button) view.findViewById(R.id.btnHelloWorld);
    btnhelloworld.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        View mainView = getView();
        TextView textView = (TextView) mainView.findViewById(R.id.txtHelloWorld);
        String text = textView.getText().toString();
        String expected = getString(R.string.message_received);

        if (Objects.equals(text, expected)) {
          textView.setText(getString(R.string.hello_world));
        } else {
          textView.setText(getString(R.string.message_received));
        }
      }
    });

    return view;
  }

  // TODO: Rename method, update argument and hook method into UI event
  public void onButtonPressed(Uri uri) {
    if (mListener != null) {
      mListener.onFragmentInteraction(uri);
    }
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    if (context instanceof OnFragmentInteractionListener) {
      mListener = (OnFragmentInteractionListener) context;
    } else {
      throw new RuntimeException(context.toString()
          + " must implement OnFragmentInteractionListener");
    }
  }

  @Override
  public void onDetach() {
    super.onDetach();
    mListener = null;
  }

  /**
   * This interface must be implemented by activities that contain this fragment to allow an
   * interaction in this fragment to be communicated to the activity and potentially other fragments
   * contained in that activity. <p> See the Android Training lesson <a href=
   * "http://developer.android.com/training/basics/fragments/communicating.html" >Communicating with
   * Other Fragments</a> for more information.
   */
  public interface OnFragmentInteractionListener {

    // TODO: Update argument type and name
    void onFragmentInteraction(Uri uri);
  }
}
