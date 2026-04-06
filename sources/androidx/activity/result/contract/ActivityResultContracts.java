package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class ActivityResultContracts {

    @Metadata
    public static class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        /* renamed from: d */
        public Intent a(Context context, Uri uri) {
            Intrinsics.i(context, "context");
            Intrinsics.i(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            Intrinsics.h(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, Uri uri) {
            Intrinsics.i(context, "context");
            Intrinsics.i(uri, "input");
            return null;
        }

        /* renamed from: f */
        public final Boolean c(int i2, Intent intent) {
            return Boolean.valueOf(i2 == -1);
        }
    }

    @Metadata
    public static class CreateDocument extends ActivityResultContract<String, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final String f260a;

        /* renamed from: d */
        public Intent a(Context context, String str) {
            Intrinsics.i(context, "context");
            Intrinsics.i(str, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f260a).putExtra("android.intent.extra.TITLE", str);
            Intrinsics.h(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, String str) {
            Intrinsics.i(context, "context");
            Intrinsics.i(str, "input");
            return null;
        }

        /* renamed from: f */
        public final Uri c(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @Metadata
    public static class GetContent extends ActivityResultContract<String, Uri> {
        /* renamed from: d */
        public Intent a(Context context, String str) {
            Intrinsics.i(context, "context");
            Intrinsics.i(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            Intrinsics.h(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, String str) {
            Intrinsics.i(context, "context");
            Intrinsics.i(str, "input");
            return null;
        }

        /* renamed from: f */
        public final Uri c(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @Metadata
    public static class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {

        /* renamed from: a  reason: collision with root package name */
        public static final Companion f261a = new Companion((DefaultConstructorMarker) null);

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List a(Intent intent) {
                Intrinsics.i(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return CollectionsKt.m();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public Companion() {
            }
        }

        /* renamed from: d */
        public Intent a(Context context, String str) {
            Intrinsics.i(context, "context");
            Intrinsics.i(str, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            Intrinsics.h(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, String str) {
            Intrinsics.i(context, "context");
            Intrinsics.i(str, "input");
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
            r2 = f261a.a(r3);
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List c(int r2, android.content.Intent r3) {
            /*
                r1 = this;
                r0 = -1
                if (r2 != r0) goto L_0x0004
                goto L_0x0005
            L_0x0004:
                r3 = 0
            L_0x0005:
                if (r3 == 0) goto L_0x000f
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r2 = f261a
                java.util.List r2 = r2.a(r3)
                if (r2 != 0) goto L_0x0013
            L_0x000f:
                java.util.List r2 = kotlin.collections.CollectionsKt.m()
            L_0x0013:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.c(int, android.content.Intent):java.util.List");
        }
    }

    @Metadata
    public static class OpenDocument extends ActivityResultContract<String[], Uri> {
        /* renamed from: d */
        public Intent a(Context context, String[] strArr) {
            Intrinsics.i(context, "context");
            Intrinsics.i(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            Intrinsics.h(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, String[] strArr) {
            Intrinsics.i(context, "context");
            Intrinsics.i(strArr, "input");
            return null;
        }

        /* renamed from: f */
        public final Uri c(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @Metadata
    public static class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        /* renamed from: d */
        public Intent a(Context context, Uri uri) {
            Intrinsics.i(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, Uri uri) {
            Intrinsics.i(context, "context");
            return null;
        }

        /* renamed from: f */
        public final Uri c(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @Metadata
    public static class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        /* renamed from: d */
        public Intent a(Context context, String[] strArr) {
            Intrinsics.i(context, "context");
            Intrinsics.i(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            Intrinsics.h(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, String[] strArr) {
            Intrinsics.i(context, "context");
            Intrinsics.i(strArr, "input");
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
            r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.f261a.a(r3);
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List c(int r2, android.content.Intent r3) {
            /*
                r1 = this;
                r0 = -1
                if (r2 != r0) goto L_0x0004
                goto L_0x0005
            L_0x0004:
                r3 = 0
            L_0x0005:
                if (r3 == 0) goto L_0x000f
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.f261a
                java.util.List r2 = r2.a(r3)
                if (r2 != 0) goto L_0x0013
            L_0x000f:
                java.util.List r2 = kotlin.collections.CollectionsKt.m()
            L_0x0013:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.contract.ActivityResultContracts.OpenMultipleDocuments.c(int, android.content.Intent):java.util.List");
        }
    }

    @Metadata
    public static final class PickContact extends ActivityResultContract<Void, Uri> {
        /* renamed from: d */
        public Intent a(Context context, Void voidR) {
            Intrinsics.i(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            Intrinsics.h(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        /* renamed from: e */
        public Uri c(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @Metadata
    public static class PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f262b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final int f263a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        /* renamed from: d */
        public Intent a(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            Intrinsics.i(context, "context");
            Intrinsics.i(pickVisualMediaRequest, "input");
            PickVisualMedia.Companion companion = PickVisualMedia.f264a;
            if (companion.d()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.b(pickVisualMediaRequest.d()));
                int min = Math.min(this.f263a, pickVisualMediaRequest.c());
                if (min <= 1 || min > MediaStore.getPickImagesMaxLimit()) {
                    throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", min);
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", pickVisualMediaRequest.b().a());
                intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", pickVisualMediaRequest.f());
                if (!pickVisualMediaRequest.e()) {
                    return intent;
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", pickVisualMediaRequest.a());
                return intent;
            } else if (companion.c(context)) {
                ResolveInfo a2 = companion.a(context);
                if (a2 != null) {
                    ActivityInfo activityInfo = a2.activityInfo;
                    Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                    intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent2.setType(companion.b(pickVisualMediaRequest.d()));
                    int min2 = Math.min(this.f263a, pickVisualMediaRequest.c());
                    if (min2 > 1) {
                        intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", min2);
                        intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", pickVisualMediaRequest.b().a());
                        intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", pickVisualMediaRequest.f());
                        if (pickVisualMediaRequest.e()) {
                            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", pickVisualMediaRequest.a());
                        }
                        return intent2;
                    }
                    throw new IllegalArgumentException("Max items must be greater than 1");
                }
                throw new IllegalStateException("Required value was null.");
            } else {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(companion.b(pickVisualMediaRequest.d()));
                intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            Intrinsics.i(context, "context");
            Intrinsics.i(pickVisualMediaRequest, "input");
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
            r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.f261a.a(r3);
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List c(int r2, android.content.Intent r3) {
            /*
                r1 = this;
                r0 = -1
                if (r2 != r0) goto L_0x0004
                goto L_0x0005
            L_0x0004:
                r3 = 0
            L_0x0005:
                if (r3 == 0) goto L_0x000f
                androidx.activity.result.contract.ActivityResultContracts$GetMultipleContents$Companion r2 = androidx.activity.result.contract.ActivityResultContracts.GetMultipleContents.f261a
                java.util.List r2 = r2.a(r3)
                if (r2 != 0) goto L_0x0013
            L_0x000f:
                java.util.List r2 = kotlin.collections.CollectionsKt.m()
            L_0x0013:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.c(int, android.content.Intent):java.util.List");
        }
    }

    @Metadata
    public static class PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public static final Companion f264a = new Companion((DefaultConstructorMarker) null);

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ResolveInfo a(Context context) {
                Intrinsics.i(context, "context");
                return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
            }

            public final String b(VisualMediaType visualMediaType) {
                Intrinsics.i(visualMediaType, "input");
                if (visualMediaType instanceof ImageOnly) {
                    return "image/*";
                }
                if (visualMediaType instanceof VideoOnly) {
                    return "video/*";
                }
                if (visualMediaType instanceof SingleMimeType) {
                    return ((SingleMimeType) visualMediaType).a();
                }
                if (visualMediaType instanceof ImageAndVideo) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }

            public final boolean c(Context context) {
                Intrinsics.i(context, "context");
                return a(context) != null;
            }

            public final boolean d() {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    return true;
                }
                return i2 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            public Companion() {
            }
        }

        @Metadata
        public static abstract class DefaultTab {

            @Metadata
            public static final class AlbumsTab extends DefaultTab {

                /* renamed from: a  reason: collision with root package name */
                public static final AlbumsTab f265a = new AlbumsTab();

                /* renamed from: b  reason: collision with root package name */
                public static final int f266b = 0;

                public AlbumsTab() {
                    super((DefaultConstructorMarker) null);
                }

                public int a() {
                    return f266b;
                }
            }

            @Metadata
            public static final class PhotosTab extends DefaultTab {

                /* renamed from: a  reason: collision with root package name */
                public static final PhotosTab f267a = new PhotosTab();

                /* renamed from: b  reason: collision with root package name */
                public static final int f268b = 1;

                public PhotosTab() {
                    super((DefaultConstructorMarker) null);
                }

                public int a() {
                    return f268b;
                }
            }

            public /* synthetic */ DefaultTab(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract int a();

            public DefaultTab() {
            }
        }

        @Metadata
        public static final class ImageAndVideo implements VisualMediaType {

            /* renamed from: a  reason: collision with root package name */
            public static final ImageAndVideo f269a = new ImageAndVideo();
        }

        @Metadata
        public static final class ImageOnly implements VisualMediaType {

            /* renamed from: a  reason: collision with root package name */
            public static final ImageOnly f270a = new ImageOnly();
        }

        @Metadata
        public static final class SingleMimeType implements VisualMediaType {

            /* renamed from: a  reason: collision with root package name */
            public final String f271a;

            public final String a() {
                return this.f271a;
            }
        }

        @Metadata
        public static final class VideoOnly implements VisualMediaType {

            /* renamed from: a  reason: collision with root package name */
            public static final VideoOnly f272a = new VideoOnly();
        }

        @Metadata
        public interface VisualMediaType {
        }

        /* renamed from: d */
        public Intent a(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            Intrinsics.i(context, "context");
            Intrinsics.i(pickVisualMediaRequest, "input");
            Companion companion = f264a;
            if (companion.d()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.b(pickVisualMediaRequest.d()));
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", pickVisualMediaRequest.b().a());
                if (!pickVisualMediaRequest.e()) {
                    return intent;
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", pickVisualMediaRequest.a());
                return intent;
            } else if (companion.c(context)) {
                ResolveInfo a2 = companion.a(context);
                if (a2 != null) {
                    ActivityInfo activityInfo = a2.activityInfo;
                    Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                    intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent2.setType(companion.b(pickVisualMediaRequest.d()));
                    intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", pickVisualMediaRequest.b().a());
                    if (pickVisualMediaRequest.e()) {
                        intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", pickVisualMediaRequest.a());
                    }
                    return intent2;
                }
                throw new IllegalStateException("Required value was null.");
            } else {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(companion.b(pickVisualMediaRequest.d()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            Intrinsics.i(context, "context");
            Intrinsics.i(pickVisualMediaRequest, "input");
            return null;
        }

        /* renamed from: f */
        public final Uri c(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) CollectionsKt.g0(GetMultipleContents.f261a.a(intent));
            }
            return data;
        }
    }

    @Metadata
    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final Companion f273a = new Companion((DefaultConstructorMarker) null);

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Intent a(String[] strArr) {
                Intrinsics.i(strArr, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                Intrinsics.h(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }

            public Companion() {
            }
        }

        /* renamed from: d */
        public Intent a(Context context, String[] strArr) {
            Intrinsics.i(context, "context");
            Intrinsics.i(strArr, "input");
            return f273a.a(strArr);
        }

        /* renamed from: e */
        public ActivityResultContract.SynchronousResult b(Context context, String[] strArr) {
            Intrinsics.i(context, "context");
            Intrinsics.i(strArr, "input");
            if (strArr.length == 0) {
                return new ActivityResultContract.SynchronousResult(MapsKt.h());
            }
            for (String a2 : strArr) {
                if (ContextCompat.a(context, a2) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.e(MapsKt.e(strArr.length), 16));
            for (String a3 : strArr) {
                Pair a4 = TuplesKt.a(a3, Boolean.TRUE);
                linkedHashMap.put(a4.e(), a4.f());
            }
            return new ActivityResultContract.SynchronousResult(linkedHashMap);
        }

        /* renamed from: f */
        public Map c(int i2, Intent intent) {
            if (i2 != -1) {
                return MapsKt.h();
            }
            if (intent == null) {
                return MapsKt.h();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return MapsKt.h();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            int length = intArrayExtra.length;
            for (int i3 = 0; i3 < length; i3++) {
                arrayList.add(Boolean.valueOf(intArrayExtra[i3] == 0));
            }
            return MapsKt.q(CollectionsKt.S0(ArraysKt.b0(stringArrayExtra), arrayList));
        }
    }

    @Metadata
    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        /* renamed from: d */
        public Intent a(Context context, String str) {
            Intrinsics.i(context, "context");
            Intrinsics.i(str, "input");
            return RequestMultiplePermissions.f273a.a(new String[]{str});
        }

        /* renamed from: e */
        public ActivityResultContract.SynchronousResult b(Context context, String str) {
            Intrinsics.i(context, "context");
            Intrinsics.i(str, "input");
            if (ContextCompat.a(context, str) == 0) {
                return new ActivityResultContract.SynchronousResult(Boolean.TRUE);
            }
            return null;
        }

        /* renamed from: f */
        public Boolean c(int i2, Intent intent) {
            if (intent == null || i2 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z2 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (intArrayExtra[i3] == 0) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    @Metadata
    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {

        /* renamed from: a  reason: collision with root package name */
        public static final Companion f274a = new Companion((DefaultConstructorMarker) null);

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        /* renamed from: d */
        public Intent a(Context context, Intent intent) {
            Intrinsics.i(context, "context");
            Intrinsics.i(intent, "input");
            return intent;
        }

        /* renamed from: e */
        public ActivityResult c(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    @Metadata
    public static final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {

        /* renamed from: a  reason: collision with root package name */
        public static final Companion f275a = new Companion((DefaultConstructorMarker) null);

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        /* renamed from: d */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Intrinsics.i(context, "context");
            Intrinsics.i(intentSenderRequest, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            Intrinsics.h(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        /* renamed from: e */
        public ActivityResult c(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    @Metadata
    public static class TakePicture extends ActivityResultContract<Uri, Boolean> {
        /* renamed from: d */
        public Intent a(Context context, Uri uri) {
            Intrinsics.i(context, "context");
            Intrinsics.i(uri, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
            Intrinsics.h(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, Uri uri) {
            Intrinsics.i(context, "context");
            Intrinsics.i(uri, "input");
            return null;
        }

        /* renamed from: f */
        public final Boolean c(int i2, Intent intent) {
            return Boolean.valueOf(i2 == -1);
        }
    }

    @Metadata
    public static class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        /* renamed from: d */
        public Intent a(Context context, Void voidR) {
            Intrinsics.i(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, Void voidR) {
            Intrinsics.i(context, "context");
            return null;
        }

        /* renamed from: f */
        public final Bitmap c(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    @Metadata
    @Deprecated
    public static class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        /* renamed from: d */
        public Intent a(Context context, Uri uri) {
            Intrinsics.i(context, "context");
            Intrinsics.i(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            Intrinsics.h(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* renamed from: e */
        public final ActivityResultContract.SynchronousResult b(Context context, Uri uri) {
            Intrinsics.i(context, "context");
            Intrinsics.i(uri, "input");
            return null;
        }

        /* renamed from: f */
        public final Bitmap c(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }
}
