package com.phone.libphone;

import android.os.Environment;

/**
 * 路径
 * Created by 王兵兵 on 2018/4/24.
 */

class Util {

    static final String MULTI_FILE_PHONE_NUMBER_METADATA_FILE_PREFIX = Environment.getExternalStorageDirectory().getAbsolutePath()+
            "/phonenumbers/data/PhoneNumberMetadataProto";
    static final String SINGLE_FILE_PHONE_NUMBER_METADATA_FILE_NAME = Environment.getExternalStorageDirectory().getAbsolutePath()+
            "/phonenumbers/data/SingleFilePhoneNumberMetadataProto";
    static final String ALTERNATE_FORMATS_FILE_PREFIX = Environment.getExternalStorageDirectory().getAbsolutePath()+
            "/phonenumbers/data/PhoneNumberAlternateFormatsProto";
    static final String SHORT_NUMBER_METADATA_FILE_PREFIX = Environment.getExternalStorageDirectory().getAbsolutePath()+
            "/phonenumbers/data/ShortNumberMetadataProto";
    static final String MAPPING_DATA_DIRECTORY_CARRIER = Environment.getExternalStorageDirectory().getAbsolutePath()+
            "/carrier/data/";
    static final String MAPPING_DATA_DIRECTORY = Environment.getExternalStorageDirectory().getAbsolutePath()+
            "/geocoding/data/";
}
