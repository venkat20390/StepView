package com.vinay.stepview.demo.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vinay.stepview.HorizontalStepView;
import com.vinay.stepview.StepView;
import com.vinay.stepview.demo.R;
import com.vinay.stepview.models.Step;

import java.util.ArrayList;
import java.util.List;

public class BasicHorizontalFragment extends Fragment {

  private StepView mHorizontalStepView;

  public BasicHorizontalFragment() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_basic_horizontal, container, false);
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    mHorizontalStepView = view.findViewById(R.id.horizontal_step_view);
  }

  @Override
  public void onStart() {
    super.onStart();

    List<Step> stepList = new ArrayList<>();
    stepList.add(new Step("Lorem", Step.State.COMPLETED));
    stepList.add(new Step("Ipsum", Step.State.COMPLETED));
    stepList.add(new Step("Dolor", Step.State.INCOMPLETE));
    stepList.add(new Step("Sit",Step.State.CURRENT));
    stepList.add(new Step("Amet"));

    mHorizontalStepView.setSteps(stepList);
    mHorizontalStepView.setIncompleteLineColor(Color.BLACK);
  }
}
