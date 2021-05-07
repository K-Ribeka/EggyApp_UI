package com.example.eggyapp;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class AddCustomerDetails extends AppCompatActivity {
private EditText name,Village,Post,Taluka,Pincode,Address,Phone,Unknown,Email,Age,Birth,Adhaar,ExtraInfo;
private ConstraintLayout nameConst,villageconst,postconst,talukaconst,pincodeconst,addressconst,phoneconst,emailconst,ageconst,birthconst,genderconst,Adhaarconst,infoconst,acceptconst;
private RadioGroup radioGrpGender;
private CheckBox Accept;
private Button btn_submit;
private String TAG = "addCust";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer_details);

        name = findViewById(R.id.customerName);
        Village = findViewById(R.id.Village);
        Post = findViewById(R.id.Post);
        Taluka = findViewById(R.id.Taluka);
        Pincode = findViewById(R.id.Pincode);
        Address = findViewById(R.id.Address);
        Phone = findViewById(R.id.Phone);
        Unknown = findViewById(R.id.Unknown);
        Email = findViewById(R.id.Email);
        radioGrpGender = findViewById(R.id.radioGrpGender);
        Age = findViewById(R.id.Age);
        Birth = findViewById(R.id.Birth);
        Adhaar = findViewById(R.id.Adhaar);
        ExtraInfo = findViewById(R.id.ExtraInfo);
        Accept = findViewById(R.id.Accept);

        //Button
        btn_submit = findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validate();
            }
        });
        //constraints
        nameConst = findViewById(R.id.nameConst);
        villageconst = findViewById(R.id.villageconst);
        postconst = findViewById(R.id.postconst);
        talukaconst = findViewById(R.id.talukaconst);
        pincodeconst = findViewById(R.id.pincodeconst);
        addressconst = findViewById(R.id.addressconst);
        emailconst = findViewById(R.id.emailconst);
        ageconst = findViewById(R.id.ageconst);
        birthconst = findViewById(R.id.birthconst);
        phoneconst = findViewById(R.id.phoneconst);
        Adhaarconst = findViewById(R.id.Adhaarconst);
        infoconst = findViewById(R.id.infoconst);
        acceptconst = findViewById(R.id.acceptconst);
        genderconst = findViewById(R.id.genderconst);

        String cust_name = name.getText().toString();
        name.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if((!hasFocus) && name.length()==0)
                {
                    nameConst.setBackgroundResource(R.drawable.cardview_redbg);
                    name.setError("Please Fill required Field");
                }
                else {
                    nameConst.setBackgroundResource(R.drawable.cardview_greyborder);
                    name.setError(null);
                }
            }
        });

        Village.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if((!hasFocus) && Village.length()==0){
                    villageconst.setBackgroundResource(R.drawable.cardview_redbg);
                    Village.setError("Please Fill required Field");
                }
                else {
                    villageconst.setBackgroundResource(R.drawable.cardview_greyborder);
                    Village.setError(null);
                }
            }
        });

        Post.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if((!hasFocus) && Post.length()==0){
                    postconst.setBackgroundResource(R.drawable.cardview_redbg);
                    Post.setError("Please Fill required Field");
                }
                else {
                    postconst.setBackgroundResource(R.drawable.cardview_greyborder);
                    Post.setError(null);
                }
            }
        });

        Taluka.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if((!hasFocus) && Taluka.length()==0){
                    talukaconst.setBackgroundResource(R.drawable.cardview_redbg);
                    Taluka.setError("Please Fill required Field");
                }
                else {
                    talukaconst.setBackgroundResource(R.drawable.cardview_greyborder);
                    Taluka.setError(null);
                }
            }
        });


        Pincode.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if((!hasFocus) && Pincode.length()==0){
                    pincodeconst.setBackgroundResource(R.drawable.cardview_redbg);
                    Pincode.setError("Please Fill required Field");
                }
                else {
                    pincodeconst.setBackgroundResource(R.drawable.cardview_greyborder);
                    Pincode.setError(null);
                }
            }
        });


        Phone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if((!hasFocus) && Phone.length()==0){
                    phoneconst.setBackgroundResource(R.drawable.cardview_redbg);
                    Phone.setError("Please Fill required Field");
                }
                else {
                    phoneconst.setBackgroundResource(R.drawable.cardview_greyborder);
                    Phone.setError(null);
                }
            }
        });

        Age.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if((!hasFocus) && Age.length()==0){
                    ageconst.setBackgroundResource(R.drawable.cardview_redbg);
                    Age.setError("Please Fill required Field");
                }
                else {
                    ageconst.setBackgroundResource(R.drawable.cardview_greyborder);
                    Age.setError(null);
                }
            }
        });


        Adhaar.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if((!hasFocus) && Age.length()==0){
                    Adhaarconst.setBackgroundResource(R.drawable.cardview_redbg);
                    Adhaar.setError("Please Fill required Field");
                }
                else {
                    Adhaarconst.setBackgroundResource(R.drawable.cardview_greyborder);
                    Adhaar.setError(null);
                }
            }
        });

        Accept.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    acceptconst.setBackgroundResource(R.drawable.cardview_greyborder);
                    Accept.setError(null);
                }
                else{
                    acceptconst.setBackgroundResource(R.drawable.cardview_redbg);
                    Accept.setError("Please Fill required Field");
                }
            }
        });

        radioGrpGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (group.getCheckedRadioButtonId() == -1) {
                    genderconst.setBackgroundResource(R.drawable.cardview_redbg);
                }
                else
                {
                    genderconst.setBackgroundResource(R.drawable.cardview_greyborder); // one of the radio buttons is checked
                }
            }
        });

//        if(!cust_name.isEmpty()){
//            Log.d(TAG, "onCreate: if part");
//            nameConst.setBackgroundResource(R.drawable.cardview_greyborder);
//            name.setError(null);
//        }
//        else{
//            Log.d(TAG, "onCreate: else part");
//           nameConst.setBackgroundResource(R.drawable.cardview_redbg);
//            name.setError("Please Fill required Field");
//
//        }




    }

    private void Validate() {
        if(name.length() > 0 && Village.length() > 0 && Post.length()>0 && Taluka.length()>0 && Phone.length()>0
            && Pincode.length()>0 && Age.length() > 0 && Adhaar.length()>0 && Accept.isChecked() && radioGrpGender.getCheckedRadioButtonId() != -1){
            Log.d(TAG,"Successfull");
        }
        else if (name.length() == 0)
        {
            nameConst.setBackgroundResource(R.drawable.cardview_redbg);
            name.setError("Please Fill required Field");
        }
        else if (Village.length() == 0)
        {
            villageconst.setBackgroundResource(R.drawable.cardview_redbg);
            Village.setError("Please Fill required Field");
        }
        else if (Post.length() == 0)
        {
            postconst.setBackgroundResource(R.drawable.cardview_redbg);
            Post.setError("Please Fill required Field");
        }
        else if (Taluka.length() == 0)
        {
            talukaconst.setBackgroundResource(R.drawable.cardview_redbg);
            Taluka.setError("Please Fill required Field");
        }
        else if (Pincode.length() == 0)
        {
            pincodeconst.setBackgroundResource(R.drawable.cardview_redbg);
            Pincode.setError("Please Fill required Field");
        }
        else if (Phone.length() == 0)
        {
            phoneconst.setBackgroundResource(R.drawable.cardview_redbg);
            Phone.setError("Please Fill required Field");
        }
        else if (Age.length() == 0)
        {
            ageconst.setBackgroundResource(R.drawable.cardview_redbg);
            Age.setError("Please Fill required Field");
        }
        else if (Adhaar.length() == 0)
        {
            Adhaarconst.setBackgroundResource(R.drawable.cardview_redbg);
            Adhaar.setError("Please Fill required Field");
        }
        else if (!Accept.isChecked())
        {
            acceptconst.setBackgroundResource(R.drawable.cardview_redbg);
            Accept.setError("Please Fill required Field");
        }
        else if (radioGrpGender.getCheckedRadioButtonId() == -1)
        {
            genderconst.setBackgroundResource(R.drawable.cardview_redbg);
        }
    }
}