package org.impl;

import org.dao.ShowCmd;

public class WinShowCmd implements ShowCmd {
    @Override
    public String showCmd() {
        return "dir";
    }
}
