package org.impl;

import org.dao.ShowCmd;

public class LinuxShowCmd implements ShowCmd {
    @Override
    public String showCmd() {
        return "ls";
    }
}
