package com.example.hp.calculator.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public abstract class ActivityCalculatorBinding extends ViewDataBinding {
  @NonNull
  public final Button add;

  @NonNull
  public final Button clear;

  @NonNull
  public final Button decimal;

  @NonNull
  public final TableLayout display;

  @NonNull
  public final Button divide;

  @NonNull
  public final EditText editText;

  @NonNull
  public final Button eight;

  @NonNull
  public final Button equal;

  @NonNull
  public final TableRow firstRow;

  @NonNull
  public final Button five;

  @NonNull
  public final Button four;

  @NonNull
  public final TextView infoTextView;

  @NonNull
  public final Button mNegative;

  @NonNull
  public final Button mPositive;

  @NonNull
  public final Button mc;

  @NonNull
  public final TextView memoryText;

  @NonNull
  public final Button minus;

  @NonNull
  public final Button mr;

  @NonNull
  public final Button multiply;

  @NonNull
  public final Button nine;

  @NonNull
  public final Button one;

  @NonNull
  public final Button positiveNegative;

  @NonNull
  public final TableRow secondRow;

  @NonNull
  public final Button seven;

  @NonNull
  public final Button six;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final Button three;

  @NonNull
  public final Button two;

  @NonNull
  public final Button zero;

  protected ActivityCalculatorBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button add, Button clear, Button decimal, TableLayout display,
      Button divide, EditText editText, Button eight, Button equal, TableRow firstRow, Button five,
      Button four, TextView infoTextView, Button mNegative, Button mPositive, Button mc,
      TextView memoryText, Button minus, Button mr, Button multiply, Button nine, Button one,
      Button positiveNegative, TableRow secondRow, Button seven, Button six,
      TableLayout tableLayout, Button three, Button two, Button zero) {
    super(_bindingComponent, _root, _localFieldCount);
    this.add = add;
    this.clear = clear;
    this.decimal = decimal;
    this.display = display;
    this.divide = divide;
    this.editText = editText;
    this.eight = eight;
    this.equal = equal;
    this.firstRow = firstRow;
    this.five = five;
    this.four = four;
    this.infoTextView = infoTextView;
    this.mNegative = mNegative;
    this.mPositive = mPositive;
    this.mc = mc;
    this.memoryText = memoryText;
    this.minus = minus;
    this.mr = mr;
    this.multiply = multiply;
    this.nine = nine;
    this.one = one;
    this.positiveNegative = positiveNegative;
    this.secondRow = secondRow;
    this.seven = seven;
    this.six = six;
    this.tableLayout = tableLayout;
    this.three = three;
    this.two = two;
    this.zero = zero;
  }

  @NonNull
  public static ActivityCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCalculatorBinding>inflate(inflater, com.example.hp.calculator.R.layout.activity_calculator, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCalculatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCalculatorBinding>inflate(inflater, com.example.hp.calculator.R.layout.activity_calculator, null, false, component);
  }

  public static ActivityCalculatorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCalculatorBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCalculatorBinding)bind(component, view, com.example.hp.calculator.R.layout.activity_calculator);
  }
}
