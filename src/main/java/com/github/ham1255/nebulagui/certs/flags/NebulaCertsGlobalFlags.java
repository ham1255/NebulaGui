/*------------------------------------------------------------------------------
       This file is under terms of GNU GENERAL PUBLIC LICENSE V2
 You should have received a copy of the license when cloning the project

            Copyright Mohammed Alteniji and contributors
                   2021-2021 All rights reserved
 -----------------------------------------------------------------------------*/

package com.github.ham1255.nebulagui.certs.flags;

public enum NebulaCertsGlobalFlags {
    VERSION("-version"),
    HELP("-h", "-help");
    private final String[] args;
    NebulaCertsGlobalFlags(String... args) {
        this.args = args;
    }

    public String[] getArgs() {
        return args;
    }
}
