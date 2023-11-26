import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.Nullable;

// Added this class to prevent NullPointerException
// All arguments in these functions are declared as NonNull in SDK 33
// But received nullable values from previous Android SDK versions (Android 10)
// Written this in Java because Kotlin won't allow to change non nullable argument to nullable one
public abstract class SafeGestureListener implements GestureDetector.OnGestureListener {
    @Override
    public boolean onDown(@Nullable MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(@Nullable MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(@Nullable MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(@Nullable MotionEvent e1, @Nullable MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(@Nullable MotionEvent e) {

    }

    @Override
    public boolean onFling(@Nullable MotionEvent e1, @Nullable MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
