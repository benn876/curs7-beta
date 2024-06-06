package org.beta.curs7.code.interface2;

public class SomeAlgorithm {
    private DataProvider dataProvider;

    public SomeAlgorithm(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public void getStringsBiggerThan(Integer biggerThan){
        for(String entity: dataProvider.provideData()){
            if(entity.length() > biggerThan){
                System.out.println(entity);
            }
        }
    }
}
