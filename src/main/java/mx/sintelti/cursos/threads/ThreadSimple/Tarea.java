package mx.sintelti.cursos.threads.ThreadSimple;

public class Tarea implements   Runnable {

    @Override
    public void  run(){
        System.out.println("Una tarea muy importante se esta afectuando..."+ Thread.currentThread().getName());
    }
}
