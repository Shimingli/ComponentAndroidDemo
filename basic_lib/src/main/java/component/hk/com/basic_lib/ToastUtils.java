package component.hk.com.basic_lib;

import android.content.Context;
import android.widget.Toast;

/**
 * author： Created by shiming on 2018/3/20 20:13
 * mailbox：lamshiming@sina.com
 */

public class ToastUtils {
    public static void show(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
