package com.sky5698.unityplugin;

import android.graphics.Color;
import android.media.Image;
import android.view.TextureView;
import android.widget.ImageView;

import java.io.File;
import java.io.Serializable;

public class PlugInClass {
    public static String GetTextFromPlugin(int number){
        return "Number is " + number;
    }
    public static String GetTextureDataFromPlugin(String input){
        //nothing here
        return "No texture data available for " + input;
    }
    public static byte[] ImageProcessingMethod(byte[] input){
        byte[] output = null;
        return output;
    }
}
