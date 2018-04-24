package com.phone.phone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.phone.libphone.NumberParseException;
import com.phone.libphone.PhoneNumberOfflineGeocoder;
import com.phone.libphone.PhoneNumberToCarrierMapper;
import com.phone.libphone.PhoneNumberUtil;
import com.phone.libphone.Phonenumber;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String swissNumberStr = "+8618811021710";
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        try {
            Phonenumber.PhoneNumber swissNumberProto = phoneUtil.parse(swissNumberStr, "CN");
            String str = phoneUtil.format(swissNumberProto, PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
            PhoneNumberOfflineGeocoder geocoder = PhoneNumberOfflineGeocoder.getInstance();
// Outputs "Zurich"
            String Description = geocoder.getDescriptionForNumber(swissNumberProto, Locale.ENGLISH);

//            Phonenumber.PhoneNumber swissMobileNumber = new Phonenumber.PhoneNumber().setCountryCode(1).setNationalNumber(14783359524L);
            PhoneNumberToCarrierMapper carrierMapper = PhoneNumberToCarrierMapper.getInstance();
// Outputs "Swisscom"
            String carrier = carrierMapper.getNameForNumber(swissNumberProto, Locale.ENGLISH);

            Log.e("wbb", "号码格式化： " + str);
            Log.e("wbb","产地:  "+Description);
            Log.e("wbb","运营商:  "+carrier);
            Log.e("wbb","号码类型:  "+phoneUtil.getNumberType(swissNumberProto));
        } catch (NumberParseException e) {
            Log.e("wbb", "NumberParseException was thrown: " + e.toString());
        }
    }
}
