package observer;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 */
public class ConcreteSubject extends Subject {
    //目标对象的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObserver();//状态发生改变，通知所有观察者
    }
}
