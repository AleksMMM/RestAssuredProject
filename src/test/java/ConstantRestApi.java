public enum ConstantRestApi {

    BASE_PATH_REGISTER("/rest/doregister"), URL("http://users.bugred.ru/tasks");

    private String name;

    ConstantRestApi(String name) {
        this.name = name;
    }
}
