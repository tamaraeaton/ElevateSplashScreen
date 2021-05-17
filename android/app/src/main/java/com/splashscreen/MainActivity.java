package com.splashscreen;
// added per https://www.youtube.com/watch?v=qRRs1K-uk4c&list=PLLKclPnY3OoK8auVFdFDXDJFyt6HGmvT2&index=26&t=829s
import android.os.Bundle;
import com.facebook.react.ReactActivity;
// added per https://www.youtube.com/watch?v=qRRs1K-uk4c&list=PLLKclPnY3OoK8auVFdFDXDJFyt6HGmvT2&index=26&t=829s
import com.zoontek.rnbootsplash.RNBootSplash;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
   
// added per https://www.youtube.com/watch?v=qRRs1K-uk4c&list=PLLKclPnY3OoK8auVFdFDXDJFyt6HGmvT2&index=26&t=829s
     @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    RNBootSplash.init(R.drawable.bootsplash, MainActivity.this); // <- display the generated bootsplash.xml drawable over our MainActivity
  }

  @Override
  protected String getMainComponentName() {
    return "splashScreen";
  }
}
