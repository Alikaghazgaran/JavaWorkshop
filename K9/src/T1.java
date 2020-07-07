public class T1 extends Thread {
    private Entity entity;
//    public T1(Entity entity) {
//        this.entity = entity;
//    }
    @Override
    public void run() {
        try {
            //Service.getInstance().save(entity);
        } catch (Exception e) {
            System.out.println("failed to save " + e.getMessage());
        }
    }
}