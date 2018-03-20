package component.hk.com.basic_base_app_lib;

import android.app.Application;
import android.support.annotation.Nullable;

/**
 * author： Created by shiming on 2018/3/20 20:18
 * mailbox：lamshiming@sina.com
 */

public class BaseApplication extends Application {
    private static BaseApplication mAppCotext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppCotext = this;
    }

    @Nullable
    public static Application getAppContext() {
        return mAppCotext;
    }
}
