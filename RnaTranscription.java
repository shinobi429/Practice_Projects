class RnaTranscription {

    String transcribe(String dnaStrand) {
        String dnaSequence = dnaStrand;
        StringBuilder rnaSequence = new StringBuilder();
        for (char nucleotide : dnaSequence.toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rnaSequence.append('C');
                    break;
                case 'C':
                    rnaSequence.append('G');
                    break;
                case 'T':
                    rnaSequence.append('A');
                    break;
                case 'A':
                    rnaSequence.append('U');
                    break;
                default:
                    // Handle invalid nucleotides if needed
                    throw new IllegalArgumentException("Invalid nucleotide: " + nucleotide);
            }
        }
        return rnaSequence.toString();
    }
}
