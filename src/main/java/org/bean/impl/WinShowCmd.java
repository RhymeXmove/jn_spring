package org.bean.impl;

import org.bean.dao.ShowCmd;

public class WinShowCmd implements ShowCmd {
    @Override
    public String showCmd() {
        return "dir";
    }
}
