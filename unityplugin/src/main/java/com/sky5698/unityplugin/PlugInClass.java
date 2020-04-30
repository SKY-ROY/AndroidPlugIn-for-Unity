package com.sky5698.unityplugin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class PlugInClass {
    /*static
    {
        System.loadLibrary("NativeImageProcessor");
    }*/
    public static String GetTextFromPlugin(int number) {
        return "Number is " + number;
    }

    public static byte[] GetTextureDataFromPlugin() {
        //procedurally generated texture [test-case]
        Bitmap.Config conf = Bitmap.Config.ARGB_8888;
        Bitmap img = Bitmap.createBitmap(128, 128, conf);

        for(int x=0; x<128; x++) {
            for(int y=0; y<128; y++) {
                if((x*y)%2 == 0) {
                    img.setPixel(x, y, Color.RED);
                }
                else {
                    img.setPixel(x, y, Color.YELLOW);
                }
            }
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream(128*128);
        img.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] output = baos.toByteArray();
        return output;
    }

    public static byte[] ImageProcessingMethod(byte[] input, int h, int w) {
        ByteArrayInputStream bais = new ByteArrayInputStream(input);
        Bitmap decodedImg = BitmapFactory.decodeStream(bais);

        //filter code

        ByteArrayOutputStream baos = new ByteArrayOutputStream(h*w);
        decodedImg.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] output = baos.toByteArray();

        return output;
    }
}
