package x;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import com.hansecom.abt.presentation.nfc.NfcHelper;

public final /* synthetic */ class b implements NfcAdapter.ReaderCallback {
    public final void onTagDiscovered(Tag tag) {
        NfcHelper.e(tag);
    }
}
