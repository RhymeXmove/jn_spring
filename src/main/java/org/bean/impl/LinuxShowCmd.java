package org.bean.impl;

import org.bean.dao.ShowCmd;

public class LinuxShowCmd implements ShowCmd {
    @Override
    public String showCmd() {
        return "ls";
    }
}
