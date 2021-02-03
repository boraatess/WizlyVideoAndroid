package com.application.android.wizlyvideo.cast;

import androidx.annotation.ColorInt;

import java.io.Serializable;

public class ExpandedControlsStyle implements Serializable {
    @ColorInt private int seekbarLineColor;
    @ColorInt private int seekbarThumbColor;
    @ColorInt private int statusTextColor;

    private ExpandedControlsStyle() { /* no-op */ }

    public int getSeekbarLineColor() {
        return seekbarLineColor;
    }

    public int getSeekbarThumbColor() {
        return seekbarThumbColor;
    }

    public int getStatusTextColor() {
        return statusTextColor;
    }

    public static class Builder {
        private ExpandedControlsStyle style;

        public Builder() {
            this.style = new ExpandedControlsStyle();
        }

        public Builder setSeekbarLineColor(@ColorInt int color) {
            style.seekbarLineColor = color;
            return this;
        }

        public Builder setSeekbarThumbColor(@ColorInt int color) {
            style.seekbarThumbColor = color;
            return this;
        }

        public Builder setStatusTextColor(@ColorInt int color) {
            style.statusTextColor = color;
            return this;
        }

        public ExpandedControlsStyle build() {
            return this.style;
        }
    }
}
