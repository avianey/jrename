package com.googlecode.jrename.gui.option.generic;

import javax.swing.JTextField;
import javax.swing.event.CaretListener;

import com.googlecode.jrename.bean.Option;
import com.googlecode.jrename.ui.Command;
import com.googlecode.jrename.ui.RenameMediator;



public class OptionTextField extends JTextField implements Command, Option {

	private static final long serialVersionUID = 1L;
	private RenameMediator med;
	private String option;
	private String defaultValue;

	public OptionTextField(CaretListener cl, RenameMediator m, String opt, String val) {
		super(val);
		option = opt;
		defaultValue = val;
		addCaretListener(cl);
        med = m;
        med.registerOption(this);
        execute();
	}
	
	public void execute() {
		med.setOption(getText(), option, String.class);
	}

	public void restoreDefault() {
		setText(defaultValue);
		execute();
	}

}
