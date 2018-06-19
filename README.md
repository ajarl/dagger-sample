# dagger-sample
A sample of using Dagger over multiple Gradle modules

There are three modules, common, featurea and app. Common declares an interface which is used by featurea but implemented in the app module. The feature module declares an actual activity which uses a FeatureA-scoped component to inject itself. This component is defined in the featurea module but _declared_ in the app module, with a dependency on the app component. This allows the actual instances inside of FeatureA to make use of types that are provided by the Singleton-scoped app component, without know about the app component at compile time.

For this to work, the feature module needs some way to acquire the component instances from the app component in a way that does not result in a circular dependency. Here we use an interface and let the Application class implement it.
