package com.googlecode.jrename.gui.action;



import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.googlecode.jrename.gui.Resources;
import com.googlecode.jrename.ui.Command;
import com.googlecode.jrename.ui.RenameMediator;



public class PreviewButton extends JButton implements Command {

	private static final long serialVersionUID = 1L;
	private RenameMediator med;

	public PreviewButton(ActionListener al, RenameMediator m) {
		super(Resources.get("button.preview"));
		setOpaque(false);
		setEnabled(false);
		addActionListener(al);
		m.registerPreview(this);
        med = m;
	}
	
	public void execute() {
		med.preview();
	}

}
