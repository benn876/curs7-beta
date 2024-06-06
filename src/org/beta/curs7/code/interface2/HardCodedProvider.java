package org.beta.curs7.code.interface2;

public class HardCodedProvider implements DataProvider {

    @Override
    public String[] provideData() {
        return new String[]{"test1", "betania the best", "whatever"};
    }
}
