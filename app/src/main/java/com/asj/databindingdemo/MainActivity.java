package com.asj.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.asj.databindingdemo.databinding.TravellerDetailPageBinding;

public class MainActivity extends AppCompatActivity {

//  private SoCoSharedPref sp;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TravellerDetailPageBinding binding = DataBindingUtil.setContentView(this, R.layout.traveller_detail_page);

    Traveller myTraveller =  new Traveller();
    myTraveller.fName = "Ajit";
    myTraveller.lName = "Jangra";
    myTraveller.email = "jangraajit@gmail.com";
    myTraveller.pic = "https://www.picmonkey.com/blog/wp-content/uploads/2016/11/1-intro-photo-final.jpg";

    ShowClickListener listener = new ShowClickListener();

    binding.setMClick(listener);
    binding.setMTraveller(myTraveller);

  }

  public class ShowClickListener {
    public void showMsg(View view) {
      Toast.makeText(getApplicationContext(), "Show Msg btn clicked", Toast.LENGTH_SHORT).show();
    }
  }
}
