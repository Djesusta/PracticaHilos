package mx.sintelti.cursos.threads.ThreadSimple;

public class ThreadMain {
    public static  void  main (String[] args)  {


        Tarea tarea =new Tarea();
        System.out.println(Thread.currentThread().getName());


        System.out.println("Tareas lanzadas");

    }

}
