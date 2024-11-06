package Lab6_10;

import java.util.Formatter;

public class Product implements Computer {
    private String mark;
    private String model;
    private String processor;
    private String monitor;
    private String memory;
    private int t = 15;

    public Product(String mark, String model, String processor, String monitor, String memory) {
        this.mark = mark;
        this.model = model;
        this.processor = processor;
        this.monitor = monitor;
        this.memory = memory;
    }

    public String getMark() {
        return this.mark;
    }

    public void replaceModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void replaceProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return this.processor;
    }

    public void replaceMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMonitor() {
        return this.monitor;
    }

    public void replaceMemory(String memory) {
        this.memory = memory;
    }

    public String getMemory() {
        return this.memory;
    }

    public String getProduct() {
        Formatter fmt = new Formatter();
        String s = "";
        fmt.format("%s" + "%" + (t - this.mark.length() + this.model.length()) + "s" +
                "%" + (t - this.model.length() + this.processor.length()) + "s" +
                "%" + (t - this.processor.length() + this.monitor.length()) + "s" +
                "%" + (t - this.monitor.length() + this.memory.length()) + "s%n",
                this.mark, this.model, this.processor, this.monitor, this.memory);
        s += fmt;
        fmt.close();
        return s;
    }
}
