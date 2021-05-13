public class SingletonDBConnection {

    private static SingletonDBConnection myOnlyInstance = null;
    // stop
    private SingletonDBConnection() {

    }

    //
    public SingletonDBConnection getInstance() {
        if (myOnlyInstance == null) {
            myOnlyInstance = new SingletonDBConnection() ;
        }
        return myOnlyInstance;
    }
}
