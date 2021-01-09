package org.impl;

import org.dao.ShowCmd;

public class LinuxShowCmd implements ShowCmd {
    @Override
    public String ShowCmd() {
        return "ls";
    }
}
