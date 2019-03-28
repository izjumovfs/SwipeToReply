# Swipe To Reply
This is a small library that can be used to implement a WhatsApp-like "swipe-to-reply" functionality in your Android apps

Here's what it looks like:

![Output sample](https://media.giphy.com/media/g0gv0D38muMSmY7CUO/source.gif)

You can use it in the next way

            SwipeController controller = new SwipeController(context, new ISwipeControllerActions() {
                @Override
                public void onSwipePerformed(int position) {
                      // Here you can handle the swipe-to-reply event
                }
            });
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(controller);
            itemTouchHelper.attachToRecyclerView(recyclerView);

You can add this library as Gradle dependency

          allprojects {
              repositories {
                ...
                maven { url 'https://jitpack.io' }
              }
            }
            
            implementation 'com.github.izjumovfs:SwipeToReply:1.0.1'
