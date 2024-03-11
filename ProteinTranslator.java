import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    Map<String, String> CODON_PROTEIN_MAP = new HashMap<>(); {
    // Populate the codon-protein mapping
    CODON_PROTEIN_MAP.put("AUG", "Methionine");
    CODON_PROTEIN_MAP.put("UUU", "Phenylalanine");
    CODON_PROTEIN_MAP.put("UUC", "Phenylalanine");
    CODON_PROTEIN_MAP.put("UUA", "Leucine");
    CODON_PROTEIN_MAP.put("UUG", "Leucine");
    CODON_PROTEIN_MAP.put("UCU", "Serine");
    CODON_PROTEIN_MAP.put("UCC", "Serine");
    CODON_PROTEIN_MAP.put("UCA", "Serine");
    CODON_PROTEIN_MAP.put("UCG", "Serine");
    CODON_PROTEIN_MAP.put("UAU", "Tyrosine");
    CODON_PROTEIN_MAP.put("UAC", "Tyrosine");
    CODON_PROTEIN_MAP.put("UGU", "Cysteine");
    CODON_PROTEIN_MAP.put("UGC", "Cysteine");
    CODON_PROTEIN_MAP.put("UGG", "Tryptophan");
    CODON_PROTEIN_MAP.put("UAA", "STOP");
    CODON_PROTEIN_MAP.put("UAG", "STOP");
    CODON_PROTEIN_MAP.put("UGA", "STOP");
    }

    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<>();
            
        for(int i=0; i<rnaSequence.length(); i+=3){

            String condon = rnaSequence.substring(i, Math.min(i + 3, rnaSequence.length()));
            String protein = CODON_PROTEIN_MAP.get(condon);

            if (condon.length() != 3) {
                throw new IllegalArgumentException("Invalid codon");
            }

            if("STOP".equals(protein)) {
                break;
            }

            if (!CODON_PROTEIN_MAP.containsKey(condon)) {
                throw new IllegalArgumentException("Invalid codon");
            }
            proteins.add(protein);
        }
        return proteins;
    }
}

/*
 * Instructions
Translate RNA sequences into proteins.

RNA can be broken into three nucleotide sequences called codons, and then translated to a polypeptide like so:

RNA: "AUGUUUUCU" => translates to

Codons: "AUG", "UUU", "UCU" => which become a polypeptide with the following sequence =>

Protein: "Methionine", "Phenylalanine", "Serine"

There are 64 codons which in turn correspond to 20 amino acids; however, all of the codon sequences and resulting amino acids are not important in this exercise. If it works for one codon, the program should work for all of them. However, feel free to expand the list in the test suite to include them all.

There are also three terminating codons (also known as 'STOP' codons); if any of these codons are encountered (by the ribosome), all translation ends and the protein is terminated.

All subsequent codons after are ignored, like this:

RNA: "AUGUUUUCUUAAAUG" =>

Codons: "AUG", "UUU", "UCU", "UAA", "AUG" =>

Protein: "Methionine", "Phenylalanine", "Serine"

Note the stop codon "UAA" terminates the translation and the final methionine is not translated into the protein sequence.

Below are the codons and resulting Amino Acids needed for the exercise.

Codon	                Protein
AUG	                    Methionine
UUU, UUC	            Phenylalanine
UUA, UUG	            Leucine
UCU, UCC, UCA, UCG	    Serine
UAU, UAC	            Tyrosine
UGU, UGC	            0ne
UGG	                    Tryptophan
UAA, UAG, UGA	        STOP
 */