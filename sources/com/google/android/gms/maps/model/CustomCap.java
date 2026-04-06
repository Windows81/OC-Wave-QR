package com.google.android.gms.maps.model;

public final class CustomCap extends Cap {
    public final BitmapDescriptor C;
    public final float D;

    public String toString() {
        String valueOf = String.valueOf(this.C);
        float f2 = this.D;
        StringBuilder sb = new StringBuilder(valueOf.length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f2);
        sb.append("]");
        return sb.toString();
    }
}
