package com.github.mikephil.charting.data;

/**
 * Created by Philipp Jahoda on 02/06/16.
 */
public abstract class BaseEntry {

    /**
     * the y value
     */
    private float y = 0f;

    /**
     * optional spot for additional data this Entry represents
     */
    private Object mData = null;

    public BaseEntry() {

    }

    public BaseEntry(float y) {
        this.y = y;
    }

    public BaseEntry(float y, Object data) {
        this(y);
        this.mData = data;
    }

    /**
     * Returns the y value of this Entry.
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the y-value for the Entry.
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Returns the data, additional information that this Entry represents, or null, if no data has
     * been specified.
     */
    public Object getData() {
        return mData;
    }

    /**
     * Sets additional data this Entry should represent.
     */
    public void setData(Object data) {
        this.mData = data;
    }
}
