package iet.lucknow.encore2019;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.net.URI;
import java.util.Random;

import static android.app.Notification.VISIBILITY_PRIVATE;
import static android.app.Notification.VISIBILITY_PUBLIC;

public class MyFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService  {
    String message_body, message_title, click_action, extra_info;
    public final String CHANNEL_ID = "custom_notifications";
    public  static final int NOTIFICATION_ID = 001;

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.e("FROM", remoteMessage.getFrom());

        if(remoteMessage.getData().size()>0){
            Log.e("Message Data", remoteMessage.getData().toString());

            message_title = remoteMessage.getData().get("title");
            Log.e("Title", message_title);

            message_body = remoteMessage.getData().get("text");
            Log.e("Body", message_body);

            extra_info = remoteMessage.getData().get("extra_information");
            Log.e("Extra Info", extra_info);

            sendNotification(message_body, message_title, extra_info);

        }


    }

    private void sendNotification(String body, String title, String data) {
        createNotificationChannel(title);
        int i = new Random().nextInt();// We have written Random no so that we can multiple notifications not only 1 that is being updated.

        Intent intent = new Intent(this, notification.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent showPendingIntent = PendingIntent.getActivity(this, i, intent, PendingIntent.FLAG_ONE_SHOT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setSmallIcon(R.drawable.logo);
        builder.setLargeIcon(BitmapFactory.decodeResource(this.getResources(),
                R.drawable.logo));
        builder.setContentTitle(title);
        builder.setContentText(body);
        builder.setSound(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.definite));
        builder.setVibrate(new long[]{Notification.DEFAULT_VIBRATE});
        builder.setVisibility(VISIBILITY_PRIVATE);
        builder.setPriority(NotificationCompat.PRIORITY_HIGH);
        builder.setAutoCancel(true);
        builder.setContentIntent(showPendingIntent);
        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(data));


        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        builder.setAutoCancel(true);
        notificationManagerCompat.notify(i, builder.build());
        Log.e("Random", String.valueOf(new Random().nextInt()));

    }

    private void createNotificationChannel(String title) {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            CharSequence name = title;
            int importance = NotificationManager.IMPORTANCE_HIGH;

            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, name, importance);

            notificationChannel.setVibrationPattern(new long[]{Notification.DEFAULT_VIBRATE});
            // Creating an Audio Attribute
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .setUsage(AudioAttributes.USAGE_ALARM)
                    .build();
            notificationChannel.setSound(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.definite),audioAttributes);
            notificationChannel.setLockscreenVisibility(VISIBILITY_PRIVATE);

            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}