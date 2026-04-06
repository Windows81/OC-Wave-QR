package com.google.zxing.multi.qrcode;

import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.qrcode.QRCodeReader;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

public final class QRCodeMultiReader extends QRCodeReader implements MultipleBarcodeReader {

    /* renamed from: b  reason: collision with root package name */
    public static final Result[] f32694b = new Result[0];

    /* renamed from: c  reason: collision with root package name */
    public static final ResultPoint[] f32695c = new ResultPoint[0];

    public static final class SAComparator implements Serializable, Comparator<Result> {
        /* renamed from: a */
        public int compare(Result result, Result result2) {
            Map a2 = result.a();
            ResultMetadataType resultMetadataType = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
            return Integer.compare(((Integer) a2.get(resultMetadataType)).intValue(), ((Integer) result2.a().get(resultMetadataType)).intValue());
        }
    }
}
