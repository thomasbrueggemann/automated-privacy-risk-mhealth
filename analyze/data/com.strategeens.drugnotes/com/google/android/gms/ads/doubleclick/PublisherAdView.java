package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.internal.class_233;

public final class PublisherAdView extends ViewGroup {
   // $FF: renamed from: ll com.google.android.gms.internal.bh
   private final class_233 field_3852;

   public PublisherAdView(Context var1) {
      super(var1);
      this.field_3852 = new class_233(this);
   }

   public PublisherAdView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.field_3852 = new class_233(this, var2, true);
   }

   public PublisherAdView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.field_3852 = new class_233(this, var2, true);
   }

   public void destroy() {
      this.field_3852.destroy();
   }

   public AdListener getAdListener() {
      return this.field_3852.getAdListener();
   }

   public AdSize getAdSize() {
      return this.field_3852.getAdSize();
   }

   public AdSize[] getAdSizes() {
      return this.field_3852.getAdSizes();
   }

   public String getAdUnitId() {
      return this.field_3852.getAdUnitId();
   }

   public AppEventListener getAppEventListener() {
      return this.field_3852.getAppEventListener();
   }

   public String getMediationAdapterClassName() {
      return this.field_3852.getMediationAdapterClassName();
   }

   public void loadAd(PublisherAdRequest var1) {
      this.field_3852.method_1592(var1.method_5211());
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      View var6 = this.getChildAt(0);
      if(var6 != null && var6.getVisibility() != 8) {
         int var7 = var6.getMeasuredWidth();
         int var8 = var6.getMeasuredHeight();
         int var9 = (var4 - var2 - var7) / 2;
         int var10 = (var5 - var3 - var8) / 2;
         var6.layout(var9, var10, var7 + var9, var8 + var10);
      }

   }

   protected void onMeasure(int var1, int var2) {
      View var3 = this.getChildAt(0);
      AdSize var4 = this.getAdSize();
      int var5;
      int var6;
      if(var3 != null && var3.getVisibility() != 8) {
         this.measureChild(var3, var1, var2);
         var6 = var3.getMeasuredWidth();
         var5 = var3.getMeasuredHeight();
      } else if(var4 != null) {
         Context var9 = this.getContext();
         var6 = var4.getWidthInPixels(var9);
         var5 = var4.getHeightInPixels(var9);
      } else {
         var5 = 0;
         var6 = 0;
      }

      int var7 = Math.max(var6, this.getSuggestedMinimumWidth());
      int var8 = Math.max(var5, this.getSuggestedMinimumHeight());
      this.setMeasuredDimension(View.resolveSize(var7, var1), View.resolveSize(var8, var2));
   }

   public void pause() {
      this.field_3852.pause();
   }

   public void recordManualImpression() {
      this.field_3852.recordManualImpression();
   }

   public void resume() {
      this.field_3852.resume();
   }

   public void setAdListener(AdListener var1) {
      this.field_3852.setAdListener(var1);
   }

   public void setAdSizes(AdSize... var1) {
      if(var1 != null && var1.length >= 1) {
         this.field_3852.method_1593(var1);
      } else {
         throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
      }
   }

   public void setAdUnitId(String var1) {
      this.field_3852.setAdUnitId(var1);
   }

   public void setAppEventListener(AppEventListener var1) {
      this.field_3852.setAppEventListener(var1);
   }
}