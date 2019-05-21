package high_order_functions;

public class HighOrderFunctionClass {
	public <T> IFactory<T> createFactory(IProducer<T> producer,IConfigurator<T> configurator) {
		return () -> {
			T instance = producer.produce();
			configurator.configure(instance);
			return instance;
		};
	}
}
