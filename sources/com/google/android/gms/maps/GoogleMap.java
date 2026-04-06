package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;

public class GoogleMap {

    /* renamed from: a  reason: collision with root package name */
    public final IGoogleMapDelegate f25949a;

    public interface CancelableCallback {
        void a();

        void onCancel();
    }

    public interface InfoWindowAdapter {
        View a(Marker marker);

        View b(Marker marker);
    }

    @Deprecated
    public interface OnCameraChangeListener {
        void a(CameraPosition cameraPosition);
    }

    public interface OnCameraIdleListener {
        void a();
    }

    public interface OnCameraMoveCanceledListener {
        void a();
    }

    public interface OnCameraMoveListener {
        void a();
    }

    public interface OnCameraMoveStartedListener {
        void a(int i2);
    }

    public interface OnCircleClickListener {
        void a(Circle circle);
    }

    public interface OnGroundOverlayClickListener {
        void a(GroundOverlay groundOverlay);
    }

    public interface OnIndoorStateChangeListener {
        void a();

        void b(IndoorBuilding indoorBuilding);
    }

    public interface OnInfoWindowClickListener {
        void a(Marker marker);
    }

    public interface OnInfoWindowCloseListener {
        void a(Marker marker);
    }

    public interface OnInfoWindowLongClickListener {
        void a(Marker marker);
    }

    public interface OnMapClickListener {
        void a(LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void a();
    }

    public interface OnMapLongClickListener {
        void a(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean a(Marker marker);
    }

    public interface OnMarkerDragListener {
        void a(Marker marker);

        void b(Marker marker);

        void c(Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        boolean a();
    }

    @Deprecated
    public interface OnMyLocationChangeListener {
        void a(Location location);
    }

    public interface OnMyLocationClickListener {
        void a(Location location);
    }

    public interface OnPoiClickListener {
        void a(PointOfInterest pointOfInterest);
    }

    public interface OnPolygonClickListener {
        void a(Polygon polygon);
    }

    public interface OnPolylineClickListener {
        void a(Polyline polyline);
    }

    public interface SnapshotReadyCallback {
        void a(Bitmap bitmap);
    }

    public GoogleMap(IGoogleMapDelegate iGoogleMapDelegate) {
        this.f25949a = (IGoogleMapDelegate) Preconditions.m(iGoogleMapDelegate);
    }
}
