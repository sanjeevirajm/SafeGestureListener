# SafeGestureListener
SafeGestureListener - class to prevent NullPointerException in some Android 10 devices. 
Those arguments are declared as NonNull in SDK 33. But it is null sometimes in older versions. 
Hence created a java class extending GestureDetector.OnGestureListener and overriden all methods with nullable arguments.
