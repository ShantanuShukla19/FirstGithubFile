package DA;
import java.util.LinkedList;
import java.util.Queue;
 public class PrinterJobScheduler {
        public static class PrinterJob {
            private String jobId;
            private int numberOfCopies;
            private boolean isCancelled;
            private boolean isDone;

            public PrinterJob(String jobId, int numberOfCopies) {
                this.jobId = jobId;
                this.numberOfCopies = numberOfCopies;
                this.isCancelled = false;
                this.isDone = false;
            }

            @Override
            public String toString() {
                return "PrinterJob{" +
                        "jobId='" + jobId + '\'' +
                        ", numberOfCopies=" + numberOfCopies +
                        '}';
            }
        }

        private Queue<PrinterJob> waitingJobs;
        private Queue<PrinterJob> cancelledJobs;
        private Queue<PrinterJob> completedJobs;

        public PrinterJobScheduler() {
            this.waitingJobs = new LinkedList<>();
            this.cancelledJobs = new LinkedList<>();
            this.completedJobs = new LinkedList<>();
        }
        public void submitJob(PrinterJob job) {
            this.waitingJobs.add(job);
        }
        public void cancelJob(PrinterJob job) {
            if (job.isDone) {
                throw new UnsupportedOperationException("Specified job is already completed; cannot be cancelled");
            } else if (job.isCancelled) {
                throw new UnsupportedOperationException("Specified job is already cancelled; cannot be cancelled again");
            }

            waitingJobs.remove(job);
            job.isCancelled = true;
            cancelledJobs.add(job);
        }
        public void completeJob(PrinterJob job) {
            if (job.isDone) {
                throw new UnsupportedOperationException("Specified job is already completed; cannot be marked done again");
            } else if (job.isCancelled) {
                throw new UnsupportedOperationException("Specified job is already cancelled; cannot be marked completed");
            }

            waitingJobs.remove(job);
            job.isDone = true;
            completedJobs.add(job);
        }
        public void displayJobStatus() {
            System.out.println("------------------------------------------------");
            System.out.println("Printing Job Statuses:");
            System.out.println("------------------------------------------------");

            if (!completedJobs.isEmpty()) {
                System.out.println("Following jobs have been completed:");
                for (PrinterJob completedJob : completedJobs) {
                    System.out.println(completedJob.toString());
                }
                System.out.println();
            }

            if (!cancelledJobs.isEmpty()) {
                System.out.println("Following jobs have been cancelled:");
                for (PrinterJob cancelledJob : cancelledJobs) {
                    System.out.println(cancelledJob.toString());
                }
                System.out.println();
            }

            if (!waitingJobs.isEmpty()) {
                System.out.println("Following jobs are waiting for processing in the following order:");
                for (PrinterJob waitingJob : waitingJobs) {
                    System.out.println(waitingJob.toString());
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            PrinterJob printerJob1 = new PrinterJob("Homework-1", 1);
            PrinterJob printerJob2 = new PrinterJob("Homework-2", 2);
            PrinterJob printerJob3 = new PrinterJob("Homework-3", 3);
            PrinterJob printerJob4 = new PrinterJob("Homework-4", 4);
            PrinterJob printerJob5 = new PrinterJob("Homework-5", 4);

            PrinterJobScheduler jobScheduler = new PrinterJobScheduler();
            jobScheduler.submitJob(printerJob1);
            jobScheduler.submitJob(printerJob2);
            jobScheduler.displayJobStatus();

            jobScheduler.completeJob(printerJob1);
            jobScheduler.submitJob(printerJob3);
            jobScheduler.submitJob(printerJob4);
            jobScheduler.submitJob(printerJob5);
            jobScheduler.displayJobStatus();

            jobScheduler.completeJob(printerJob2);
            jobScheduler.completeJob(printerJob3);
            jobScheduler.cancelJob(printerJob4);
            jobScheduler.displayJobStatus();
        }
    }

