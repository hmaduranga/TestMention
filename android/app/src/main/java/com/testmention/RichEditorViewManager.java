package com.testmention;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.linkedin.android.spyglass.ui.RichEditorView;

public class RichEditorViewManager extends SimpleViewManager<RichEditorView> {

  public static final String REACT_CLASS = "RichEditorView";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  public RichEditorView createViewInstance(ThemedReactContext reactContext) {

    RichEditorView richEditorView = new RichEditorView(reactContext);
    return richEditorView;
  }

}