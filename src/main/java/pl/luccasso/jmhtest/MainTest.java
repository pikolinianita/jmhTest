/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.luccasso.jmhtest;

import java.io.IOException;
import java.util.LinkedList;
import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.RunnerException;

/**
 *
 * @author piko
 */
public class MainTest {
    
    public static void main(String[] args) throws RunnerException, IOException {
        Main.main(args);
    }
    
    @Benchmark
    public void TestCase(){
        var list = new LinkedList<Integer>();
                
    }
    
}
