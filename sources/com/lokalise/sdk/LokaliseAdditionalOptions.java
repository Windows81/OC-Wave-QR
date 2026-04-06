package com.lokalise.sdk;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata
public interface LokaliseAdditionalOptions {
    void translatePreferenceFragment(int i2, RecyclerView recyclerView);

    void translateToolbarMenuItems(Toolbar toolbar);
}
