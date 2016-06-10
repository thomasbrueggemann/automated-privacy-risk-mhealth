package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.session.MediaController;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

class ActivityCompat21 {
   private static android.app.SharedElementCallback createCallback(ActivityCompat21.SharedElementCallback21 var0) {
      ActivityCompat21.SharedElementCallbackImpl var1 = null;
      if(var0 != null) {
         var1 = new ActivityCompat21.SharedElementCallbackImpl(var0);
      }

      return var1;
   }

   public static void finishAfterTransition(Activity var0) {
      var0.finishAfterTransition();
   }

   public static void postponeEnterTransition(Activity var0) {
      var0.postponeEnterTransition();
   }

   public static void setEnterSharedElementCallback(Activity var0, ActivityCompat21.SharedElementCallback21 var1) {
      var0.setEnterSharedElementCallback(createCallback(var1));
   }

   public static void setExitSharedElementCallback(Activity var0, ActivityCompat21.SharedElementCallback21 var1) {
      var0.setExitSharedElementCallback(createCallback(var1));
   }

   public static void setMediaController(Activity var0, Object var1) {
      var0.setMediaController((MediaController)var1);
   }

   public static void startPostponedEnterTransition(Activity var0) {
      var0.startPostponedEnterTransition();
   }

   public abstract static class SharedElementCallback21 {
      public abstract Parcelable onCaptureSharedElementSnapshot(View var1, Matrix var2, RectF var3);

      public abstract View onCreateSnapshotView(Context var1, Parcelable var2);

      public abstract void onMapSharedElements(List<String> var1, Map<String, View> var2);

      public abstract void onRejectSharedElements(List<View> var1);

      public abstract void onSharedElementEnd(List<String> var1, List<View> var2, List<View> var3);

      public abstract void onSharedElementStart(List<String> var1, List<View> var2, List<View> var3);
   }

   private static class SharedElementCallbackImpl extends android.app.SharedElementCallback {
      private ActivityCompat21.SharedElementCallback21 mCallback;

      public SharedElementCallbackImpl(ActivityCompat21.SharedElementCallback21 var1) {
         this.mCallback = var1;
      }

      public Parcelable onCaptureSharedElementSnapshot(View var1, Matrix var2, RectF var3) {
         return this.mCallback.onCaptureSharedElementSnapshot(var1, var2, var3);
      }

      public View onCreateSnapshotView(Context var1, Parcelable var2) {
         return this.mCallback.onCreateSnapshotView(var1, var2);
      }

      public void onMapSharedElements(List<String> var1, Map<String, View> var2) {
         this.mCallback.onMapSharedElements(var1, var2);
      }

      public void onRejectSharedElements(List<View> var1) {
         this.mCallback.onRejectSharedElements(var1);
      }

      public void onSharedElementEnd(List<String> var1, List<View> var2, List<View> var3) {
         this.mCallback.onSharedElementEnd(var1, var2, var3);
      }

      public void onSharedElementStart(List<String> var1, List<View> var2, List<View> var3) {
         this.mCallback.onSharedElementStart(var1, var2, var3);
      }
   }
}