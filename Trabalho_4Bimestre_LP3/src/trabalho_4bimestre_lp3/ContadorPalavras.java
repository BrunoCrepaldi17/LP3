package trabalho_4bimestre_lp3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bcrep
 */
public class ContadorPalavras {

    // Lista de todos os Verbos
    private static final List<String> VERBOS = Arrays.asList(
            "ser", "estar", "ter", "ir", "fazer", "vir", "dar", "dizer", "poder", "saber",
            "amar", "começar", "acabar", "continuar", "dever", "sentir", "pensar", "querer", "precisar", "parar",
            "viver", "morrer", "nascer", "crescer", "mudar", "trabalhar", "estudar", "jogar", "ler", "escrever",
            "falar", "escutar", "ver", "olhar", "sentir", "cheirar", "provar", "tocar", "conhecer", "lembrar",
            "esquecer", "perdoar", "acreditar", "confiar", "esperar", "desesperar", "sonhar", "imaginar", "desejar",
            "pedir", "agradecer", "reclamar", "mandar", "obedecer", "prometer", "cumprir", "mentir", "enganar",
            "roubar", "matar", "ferir", "destruir", "ajudar", "salvar", "proteger", "cuidar", "amar", "odiar",
            "ter medo", "ter vergonha", "ter fome", "ter sede", "ter sono", "ter frio", "ter calor", "ter pressa",
            "ter raiva", "ter ciúmes", "ter inveja", "ter orgulho", "ter fé", "ter esperança", "ter sorte", "ter azar",
            "ter sucesso", "ter fracassos", "ter problemas", "ter soluções", "ter sonhos", "ter planos", "ter objetivos",
            "ter desejos", "ter ambições", "ter vontades", "ter ideias", "ter pensamentos", "ter sentimentos", "ter emoções",
            "ter sensações", "ter percepções", "ter memórias", "ter lembranças", "ter experiências", "ter conhecimentos",
            "ter habilidades", "ter talentos", "ter capacidades", "ter potencial", "ter limites", "ter fraquezas", "ter defeitos",
            "ter qualidades", "ter virtudes", "ter valores", "ter princípios", "ter crenças", "ter convicções", "ter opiniões",
            "ter atitudes", "ter comportamentos", "ter hábitos", "ter costumes", "ter tradições", "ter culturas", "ter religiões",
            "ter filosofias", "ter ideologias", "ter políticas", "ter economias", "ter sociedades", "ter tecnologias",
            "ter ciências", "ter artes", "ter literaturas", "ter músicas", "ter danças", "ter teatros", "ter cinemas",
            "ter esportes", "ter jogos", "ter brincadeiras", "ter diversões", "ter entretenimentos", "ter lazeres",
            "ter tempos livres", "ter férias", "ter feriados", "ter finais de semana", "ter dias", "ter noites",
            "ter manhãs", "ter tardes", "ter noites", "ter estações do ano", "ter anos", "ter décadas", "ter séculos",
            "ter milênios", "ter eras", "ter tempos", "ter espaços", "ter universos", "ter mundos", "ter planetas",
            "ter estrelas", "ter galáxias", "ter buracos negros", "ter matéria", "ter energia", "ter tempo", "ter espaço",
            "ter vida", "ter morte", "ter amor", "ter ódio", "ter paz", "ter guerra", "ter felicidade", "ter tristeza",
            "ter esperança", "ter desespero", "ter fé", "ter dúvida", "ter certeza", "ter incerteza", "ter verdade",
            "ter mentira", "ter justiça", "ter injustiça", "ter liberdade", "ter opressão", "ter igualdade", "ter desigualdade",
            "ter democracia", "ter ditadura", "ter capitalismo", "ter socialismo", "ter comunismo", "ter anarquismo",
            "ter monarquia", "ter república", "ter imperialismo", "ter colonialismo", "ter globalização", "ter regionalismo",
            "ter nacionalismo", "ter internacionalismo", "ter multiculturalismo", "ter interculturalismo", "ter plurilinguismo", "ter monolinguismo", "ter diversidade", "ter unidade", "ter complexidade", "ter simplicidade",
            "ter ordem", "ter caos", "ter beleza", "ter feiura", "ter harmonia", "ter dissonância", "ter perfeição",
            "ter imperfeição", "ter bem", "ter mal", "ter certo", "ter errado", "ter positivo", "ter negativo",
            "ter construtivo", "ter destrutivo", "ter sagrado", "ter profano", "ter divino", "ter humano",
            "ter natural", "ter artificial", "ter real", "ter virtual", "ter objetivo", "ter subjetivo", "ter racional",
            "ter irracional", "ter lógico", "ter ilógico", "ter consciente", "ter inconsciente", "ter individual",
            "ter coletivo", "ter público", "ter privado", "ter interno", "ter externo", "ter aparente", "ter real",
            "ter superficial", "ter profundo", "ter simples", "ter complexo", "ter fácil", "ter difícil", "ter claro",
            "ter obscuro", "ter evidente", "ter oculto", "ter conhecido", "ter desconhecido", "ter familiar", "ter estranho",
            "ter habitual", "ter inusitado", "ter comum", "ter raro", "ter normal", "ter anormal", "ter típico", "ter atípico",
            "ter convencional", "ter inusitado", "ter tradicional", "ter moderno", "ter antigo", "ter novo", "ter velho",
            "ter atual", "ter passado", "ter futuro", "ter presente", "ter permanente", "ter temporário", "ter eterno",
            "ter efêmero", "ter finito", "ter infinito", "ter limitado", "ter ilimitado", "ter relativo", "ter absoluto",
            "ter concreto", "ter abstrato", "ter material", "ter imaterial", "ter físico", "ter metafísico", "ter sensorial",
            "ter intuitivo", "ter racional", "ter emocional", "ter espiritual", "ter religioso", "ter filosófico",
            "ter científico", "ter artístico", "ter literário", "ter musical", "ter teatral", "ter cinematográfico",
            "ter esportivo", "ter lúdico", "ter recreativo", "ter prazeroso", "ter doloroso", "ter alegre", "ter triste",
            "ter feliz", "ter infeliz", "ter satisfeito", "ter insatisfeito", "ter motivado", "ter desmotivado",
            "ter animado", "ter desanimado", "ter esperançoso", "ter desesperançoso", "ter confiante", "ter desconfiado",
            "ter otimista", "ter pessimista", "ter realista", "ter idealista", "ter racional", "ter emocional",
            "ter introvertido", "ter extrovertido", "ter pacífico", "ter agressivo", "ter calmo", "ter agitado",
            "ter organizado", "ter desorganizado", "ter responsável", "ter irresponsável", "ter honesto", "ter desonesto",
            "ter sincero", "ter mentiroso", "ter leal", "ter desleal", "ter fiel", "ter infiel", "ter corajoso", "ter medroso",
            "ter forte", "ter fraco", "ter sábio", "ter tolo", "ter inteligente", "ter burro", "ter bonito", "ter feio",
            "ter jovem", "ter velho", "ter grande", "ter pequeno", "ter alto", "ter baixo", "ter grosso", "ter fino",
            "ter rápido", "ter lento", "ter quente", "ter frio", "ter doce", "ter salgado", "ter azedo", "ter amargo",
            "ter macio", "ter duro", "ter liso", "ter áspero", "ter claro", "ter escuro", "ter colorido", "ter preto",
            "ter branco", "ter vermelho", "ter verde", "ter azul", "ter amarelo", "ter laranja", "ter roxo", "ter etc", "caminhar",
            "correr", "saltar", "brincar","cantar","observar","sentir","pensar","sonhar","criar"
    );
    
    // Lista de todos os Adjetivos
    private static final List<String> ADJETIVOS = Arrays.asList(
            "alto", "baixo", "grande", "pequeno", "grosso", "fino", "largo", "estreito", "comprido", "curto",
            "forte", "fraco", "pesado", "leve", "rápido", "lento", "novo", "velho", "bonito", "feio", "limpo", "po", "sujo", "caro", "barato", "bom", "mau", "feliz", "triste", "alegre", "contente", "satisfeito",
            "insatisfeito", "animado", "desanimado", "motivado", "desmotivado", "esperançoso", "desesperanço",
            "confiante", "desconfiado", "otimista", "pessimista", "realista", "idealista", "racional", "emocional",
            "introvertido", "extrovertido", "pacífico", "agressivo", "calmo", "agitado", "organizado", "desorganizado",
            "responsável", "irresponsável", "honesto", "desonesto", "sincero", "mentiroso", "leal", "desleal", "fiel",
            "infiel", "corajoso", "medroso", "forte", "fraco", "sábio", "tolo", "inteligente", "burro", "bonito",
            "feio", "jovem", "velho", "alto", "baixo", "grosso", "fino", "rápido", "lento", "quente", "frio", "doce",
            "salgado", "azedo", "amargo", "macio", "duro", "liso", "áspero", "claro", "escuro", "colorido", "preto",
            "branco", "vermelho", "verde", "azul", "amarelo", "laranja", "roxo", "verdadeiro", "falso", "certo",
            "errado", "justo", "injusto", "igual", "desigual", "livre", "opresso", "democrático", "ditatorial",
            "capitalista", "socialista", "comunista", "anarquista", "monarquista", "republicano", "imperialista",
            "colonialista", "globalizado", "regionalista", "nacionalista", "internacionalista", "multiculturalista",
            "interculturalista", "plurilingue", "monolingue", "diverso", "unitário", "complexo", "simples", "ordenado",
            "caótico", "belo", "feio", "harmônico", "dissonante", "perfeito", "imperfeito", "bom", "mau", "certo",
            "errado", "positivo", "negativo", "construtivo", "destrutivo", "sagrado", "profano", "divino", "humano",
            "natural", "artificial", "real", "virtual", "objetivo", "subjetivo", "racional", "irracional", "lógico",
            "ilógico", "consciente", "inconsciente", "individual", "coletivo", "público", "privado", "interno",
            "externo", "aparente", "real", "superficial", "profundo", "simples", "complexo", "fácil", "difícil",
            "claro", "obscuro", "evidente", "oculto", "conhecido", "desconhecido", "familiar", "estranho", "habitual",
            "inusitado", "comum", "raro", "normal", "anormal", "típico", "atípico", "convencional", "inusitado",
            "tradicional", "moderno", "antigo", "novo", "velho", "atual", "passado", "futuro", "presente", "permanente",
            "temporário", "eterno", "efêmero", "finito", "infinito", "limitado", "ilimitado", "relativo", "absoluto",
            "concreto", "abstrato", "material", "imaterial", "físico", "metafísico", "sensorial", "intuitivo",
            "racional", "emocional", "espiritual", "religioso", "filosófico", "científico", "artístico", "literário",
            "musical", "teatral", "cinematográfico", "esportivo", "lúdico", "recreativo", "prazeroso", "doloroso",
            "alegre", "triste", "feliz", "infeliz", "satisfeito", "insatisfeito", "motivado", "desmotivado",
            "animado", "desanimado", "esperançoso", "desesperançoso", "confiante", "desconfiado", "otimista", "pessimista", "realista", "idealista", "racional", "emocional", "introvertido", "extrovertido",
            "pacífico", "agressivo", "calmo", "agitado", "organizado", "desorganizado", "responsável", "irresponsável",
            "honesto", "desonesto", "sincero", "mentiroso", "leal", "desleal", "fiel", "infiel", "corajoso", "medroso",
            "forte", "fraco", "sábio", "tolo", "inteligente", "burro", "bonito", "feio", "jovem", "velho", "alto",
            "baixo", "grosso", "fino", "rápido", "lento", "quente", "frio", "doce", "salgado", "azedo", "amargo",
            "macio", "duro", "liso", "áspero", "claro", "escuro", "colorido", "preto", "branco", "vermelho", "verde",
            "azul", "amarelo", "laranja", "roxo", "etc"
    );
    
    // Lista de todas as Preposições
    private static final List<String> PREPOSICOES = Arrays.asList(
            "de", "para", "em", "com", "por", "a", "até", "sem", "contra", "sobre",
            "debaixo", "dentro", "atrás", "diante", "além", "abaixo", "acima", "durante",
            "mediante", "apesar", "graças", "segundo", "conforme", "desde", "até", "até que",
            "assim", "como", "quando", "onde", "porque", "pois", "mas", "se", "ou", "nem",
            "também", "então", "logo", "ainda", "já", "mais", "menos", "bem", "mal", "bastante",
            "tudo", "nada", "só", "apenas", "algum", "nenhum", "alguns", "nenhuns", "qualquer",
            "cada", "todo", "muitos", "poucos", "quem", "que", "cujo", "cuja", "cujos", "cujas",
            "o", "a", "os", "as", "um", "uma", "uns", "umas", "meu", "minha", "meus", "minhas",
            "seu", "sua", "seus", "suas", "teu", "tua", "teus", "tuas", "nosso", "nossa", "nossos",
            "nossas", "vosso", "vossa", "vossos", "vossas", "dele", "dela", "deles", "delas", "este",
            "esta", "isto", "estes", "estas", "esse", "essa", "isso", "esses", "essas", "aquele",
            "aquela", "aquilo", "aqueles", "aquelas", "qual", "quais", "quanto", "quanta", "quantos",
            "quantas", "onde", "como", "quando", "porque", "se", "mas", "então", "logo", "ainda",
            "já", "mais", "menos", "bem", "mal", "bastante", "tudo", "nada", "só", "apenas", "algum",
            "nenhum", "alguns", "nenhuns", "qualquer", "cada", "todo", "muitos", "poucos", "quem",
            "que", "cujo", "cuja", "cujos", "cujas", "é", "são", "era", "eram", "fui", "foi",
            "fomos", "foram", "serei", "será", "seremos", "serão", "estive", "esteve", "estivemos",
            "estiveram", "estarei", "estará", "estaremos", "estarão", "hei de ser", "há de ser",
            "haja sido", "tenho", "tem", "temos", "têm", "tinha", "tinha", "tínhamos", "tinham",
            "terei", "terá", "teremos", "terão", "tive", "teve", "tivemos", "tiveram", "teria",
            "teria", "teríamos"
    );

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();


        // Contador de palavras
        int totalPalavras = 0;
        texto = subPalavra(texto);

        for (String palavra : texto.split(" ")) {
            totalPalavras++;
        }

        // Contador de verbos, adjetivos e preposições
        int verbos = 0;
        int adjetivos = 0;
        int preposicoes = 0;
        for (String palavra : texto.split(" ")) {
            if (VERBOS.contains(palavra.toLowerCase())) {
                verbos++;
            } else if (ADJETIVOS.contains(palavra.toLowerCase())) {
                adjetivos++;
            } else if (PREPOSICOES.contains(palavra.toLowerCase())) {
                preposicoes++;
            }
        }

        // Exibi todos os resultados 
        System.out.println("\nResultados:");
        System.out.println("  - Total de palavras: " + totalPalavras);
        System.out.println("  - Verbos: " + verbos);
        System.out.println("  - Adjetivos: " + adjetivos);
        System.out.println("  - Preposições: " + preposicoes);

        sc.close();
    }

    private static String subPalavra(String texto) {
        texto = texto.replaceAll(",", "");
        texto = texto.replaceAll("\\.", "");
        return texto;
    }
}
