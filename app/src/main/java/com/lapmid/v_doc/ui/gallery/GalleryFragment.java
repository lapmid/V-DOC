package com.lapmid.v_doc.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.lapmid.v_doc.R;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel = ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_services, container, false);

        WebView view = new WebView(this.getActivity());
        view.setVerticalScrollBarEnabled(false);
        ((LinearLayout)root.findViewById(R.id.services_para1)).addView(view);
        view.loadData(getString(R.string.services_para1), "text/html; charset=utf-8", "utf-8");

        return root;
    }
}