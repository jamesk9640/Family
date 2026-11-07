package com.myfamily.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;
import java.util.Locale;

public class BirthdayReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context ctx, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Notifier.scheduleDaily(ctx);
            return;
        }
        String data = ctx.getSharedPreferences("bd", Context.MODE_PRIVATE).getString("list", "");
        if (data.isEmpty()) return;
        Calendar t = Calendar.getInstance();
        String today = String.format(Locale.US, "%02d-%02d", t.get(Calendar.MONTH) + 1, t.get(Calendar.DAY_OF_MONTH));
        t.add(Calendar.DAY_OF_YEAR, 1);
        String tomorrow = String.format(Locale.US, "%02d-%02d", t.get(Calendar.MONTH) + 1, t.get(Calendar.DAY_OF_MONTH));
        StringBuilder sb = new StringBuilder();
        for (String item : data.split(";")) {
            String[] p = item.split("\\|");
            if (p.length < 2) continue;
            if (p[1].equals(today)) sb.append(p[0]).append("'s birthday is today! ");
            else if (p[1].equals(tomorrow)) sb.append(p[0]).append("'s birthday is tomorrow. ");
        }
        if (sb.length() > 0) Notifier.show(ctx, 2, "Birthday reminder", sb.toString().trim());
    }
}
